# Personal Android Project Template

[//]: # Hand Solitaire

## Summary

[//]: # A simple game in which a small set of cards is displayed and a very few 
rules are utilized on a standard deck of playing cards with the goal being to discard 
all cards.  The deck is shuffled to begin, four cards are dealt to the player, and the 
top card has to correlate to the bottom card in the hand.  
-If the top card is of the same suit as the bottom card, the middle two cards are discarded.  
-If the top card is the same rank as the bottom card, all four cards are discarded.  
-If the top card is neither the same suit nor the same rank as the bottom card, the player 
draws another card and looks to what is now the fourth card back. What was the original 
third to last card, and makes the same assessment, and so on.  
-If the whole deck is gone through and the player still has cards in their hand, they can 
pull the last card to the front, and see how that plays, up to three times.  
After that, the deck is played out and the player has lost if any cards are left in their 
hand.

Scoring has only three parameters: finishing by way of discarding all the cards during 
the course of the game, which is the only way to truly win; the amount of cards left if 
finishing is not possible (different award levels for 1-4, 5-8, 9-12, and 13 or more cards
remaining); and then there may be a time bonus if the player beats their prior time.

## Credits, copyrights, and license information

[//]: # Code, build scripts, workflow definitions, and instructional content written 
by Kristen Ekedal (with ____________________).

&copy; 2026 by (Kristen Ekedal).

[//]: # (TODO Add license info)
