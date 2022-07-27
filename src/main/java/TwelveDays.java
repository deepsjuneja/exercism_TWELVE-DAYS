class TwelveDays {
    String days[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    String presents[] = {" a Partridge in a Pear Tree.\n",
                        " two Turtle Doves, and",
                        " three French Hens,",
                        " four Calling Birds,",
                        " five Gold Rings,",
                        " six Geese-a-Laying,",
                        " seven Swans-a-Swimming,",
                        " eight Maids-a-Milking,",
                        " nine Ladies Dancing,",
                        " ten Lords-a-Leaping,",
                        " eleven Pipers Piping,",
                        " twelve Drummers Drumming,"};

    String openingVersePartOne = "On the ";
    String openingVersePartTwo = " day of Christmas my true love gave to me:";

    String verse(int verseNumber) {
        String versePhrase = "";

        versePhrase = openingVersePartOne + days[verseNumber - 1] + openingVersePartTwo;

        for(int i=verseNumber-1;i>=0;i--) {
            versePhrase += presents[i];
        }

        return versePhrase;
    }

    String verses(int startVerse, int endVerse) {
        String versePhrases = "";

        for(int i=startVerse;i<=endVerse;i++) {
            versePhrases += verse(i);

            if(i != endVerse)
                versePhrases += "\n";
        }

        return versePhrases;
    }
    
    String sing() {
        return verses(1, 12);
    }
}
