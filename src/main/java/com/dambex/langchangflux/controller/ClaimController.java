package com.dambex.langchangflux.controller;

import com.dambex.langchangflux.service.agent.ClaimAgent;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin(
        originPatterns = "*",
        allowedHeaders = "*",
        methods = {
                RequestMethod.GET,
                RequestMethod.POST,
                RequestMethod.OPTIONS
        }
)
public class ClaimController {

    private final ClaimAgent claimAgent;

    public ClaimController(ClaimAgent claimAgent) {
        this.claimAgent = claimAgent;
    }

    @GetMapping(value = "/ask", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> ask(
            @RequestParam(value = "memoryId", defaultValue = "123") String memoryId,
            @RequestParam(value = "question", defaultValue = "Are there any claims?") String question) {

        return Mono.fromCallable(() -> claimAgent.chat(memoryId, question))
                .subscribeOn(Schedulers.boundedElastic()) // <--- This is the magic fix
                .flatMapMany(flux -> flux); // Unwraps the Flux<String> from the Agent
    }
}