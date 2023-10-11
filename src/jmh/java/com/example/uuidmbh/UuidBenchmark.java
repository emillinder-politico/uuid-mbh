package com.example.uuidmbh;

import org.apache.commons.lang3.RandomStringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class UuidBenchmark {

    @Benchmark
    public void uuid_by_exception(Blackhole bh) {
        UuidParser uuidBenchmark = new UuidParser();
        bh.consume(uuidBenchmark.uuidWithExceptionGuard("123e4567-e89b-12d3-a456-" + RandomStringUtils.randomAlphabetic(6)));
    }

    @Benchmark
    public void uuid_by_pattern(Blackhole bh) {
        UuidParser uuidBenchmark = new UuidParser();
        bh.consume(uuidBenchmark.uuidWithPatternGuard("123e4567-e89b-12d3-a456-xxx" + RandomStringUtils.randomAlphabetic(6)));
    }

}
