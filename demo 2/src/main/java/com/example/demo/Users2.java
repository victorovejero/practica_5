package com.example.demo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

record Users2(
        @Size(min = 2, max = 15)
        String name,
        @Size(min = 2, max = 30)
        String lastName) {}