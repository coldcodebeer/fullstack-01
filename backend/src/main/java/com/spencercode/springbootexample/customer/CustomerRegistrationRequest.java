package com.spencercode.springbootexample.customer;

public record CustomerRegistrationRequest (
        String name, String email, Integer age) {
}
