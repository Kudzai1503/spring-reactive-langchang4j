package com.dambex.langchangflux.repository;



import com.dambex.langchangflux.domain.Claim;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends R2dbcRepository<Claim, Long> {
}