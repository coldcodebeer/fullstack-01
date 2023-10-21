package com.spencercode.springbootexample.customer;

public record CustomerUpdateRequest (
        String name,
        String email,
        Integer age
) {
}
