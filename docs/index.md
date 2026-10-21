---
title: Hand Solitaire
description: "Summary of in-progress or completed project."
order: 0
---

{% include ddc-abbreviations.md %}

## Page contents
{:.no_toc}

{:.collapsible.collapsed}
- ToC
{:toc}

## Summary

A simple game in which a small set of cards is displayed and a very few 
rules are utilized on a standard deck of playing cards with the goal being to discard 
all cards.  The deck is shuffled to begin, four cards are dealt to the player, and the 
top card has to correlate to the bottom card in the hand.  

- If the top card is of the same suit as the bottom card, the middle two cards are discarded.  
- If the top card is the same rank as the bottom card, all four cards are discarded.  
- If the top card is neither the same suit nor the same rank as the bottom card, the player 
draws another card and looks to what is now the fourth card back (what was the original 
third to last card) and makes the same assessment, and so on.
- If the whole deck is gone through and the player still has cards in their hand, they can 
pull the last card to the front, and see how that plays, up to three times.  
After that, the deck is played out and the player has lost if any cards are left in their 
hand.



## Intended users and user stories

* Types of intended users are anyone with a few minutes to spare and an interest in cards that may 
not want to play the standard type of solitaire.  Hand solitaire allows a very casual yet specific 
approach to the solitaire model. I play hand solitaire when I want to restore peace and serenity.


## Functionality

### Scoring

Scoring has only three parameters: finishing by way of discarding all the cards during
the course of the game, which is the only way to truly win; the amount of cards left if
finishing is not possible (different award levels for 1-4, 5-8, 9-12, and 13 or more cards
remaining); and then there may be a time bonus if the player beats their prior time.

Badges are awarded in the following levels:
- Gold Star - the player has won the game and is awarded one Gold Star.
- Silver Star - the player is left with only 1-4 cards at end of game.
- Bronze Star - the player is left with 5-8 cards at end of game.
- Wood Star - the player is left with 9-12 cards at end of game.
- Lump o'Coal - the player is left with 13+ cards at end of game.

## Persistent data

[//]: # (TODO Using a bullet list, list what content will be maintained in server-side storage. This should include any information that users of your app would expect to be maintained &#40;i.e., without connection to a server&#41; across multiple sessions of use.)

## Device/external services

[//]: # (TODO If the client component will need to access special services of the client device &#40;e.g., sensors, contacts, messaging&#41;, list them here using a bullet list. Also, if the client component will need to access already-existing external services &#40;e.g., real-time weather data, Open Movie Database, Open Trivia Database&#41;, those should also be listed here.)

## Stretch goals and possible enhancements 

[//]: # (TODO If you can identify functional elements of the software that you think might not be achievable in the scope of the project, but which would nonetheless add significant value if you were able to include them, list them here. For now, we recommend listing them in order of complexity/amount of work, from the least to the most.)

## Credits, copyrights, and license information

# Code, build scripts, workflow definitions, and instructional content written
by Kristen Ekedal (with ____________________).

&copy; 2026 by (Kristen Ekedal).

[//]: # (TODO Add license info)
