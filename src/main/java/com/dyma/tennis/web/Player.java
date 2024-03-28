package com.dyma.tennis.web;

import com.dyma.tennis.Rank;

import java.time.LocalDate;

public record Player(String firstName, String lastName, LocalDate birthdate, Rank rank) {

}
