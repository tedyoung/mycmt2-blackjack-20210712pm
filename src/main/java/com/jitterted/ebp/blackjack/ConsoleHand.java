package com.jitterted.ebp.blackjack;

import java.util.stream.Collectors;

import static org.fusesource.jansi.Ansi.ansi;

public class ConsoleHand {

    static String displayFirstCard(Hand hand) {
        return ConsoleCard.display(hand.faceUpCard());
    }

    // GOAL: String cardsAsString(Hand hand) <-- TRANSFORMATION of Hand (DOMAIN) to String (CONSOLE ADAPTER)
    public static String cardsAsString(Hand hand) {
        return hand.cards().stream()
                   .map(ConsoleCard::display)
                   .collect(Collectors.joining(
                           ansi().cursorUp(6).cursorRight(1).toString()));
    }
}