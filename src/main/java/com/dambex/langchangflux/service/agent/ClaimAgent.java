package com.dambex.langchangflux.service.agent;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService
public interface ClaimAgent {

    @SystemMessage("""
        You are a claims auditor. Use the provided claim data and metadata 
        to answer questions. If you don't know the answer, say you don't know.
        Always mention the Claim ID when discussing a specific claim.
        Make sure you properly present the information in a clear and concise manner.
        """)
    Flux<String> chat(@MemoryId String memoryId, @UserMessage String userMessage);

}