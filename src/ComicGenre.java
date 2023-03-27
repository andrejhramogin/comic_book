public enum ComicGenre {
    CHILDREN_STORY,
    DETECTIVE,
    FANTASY,
    ACTION,
    SCIENCE_FICTION,
    THRILLER,
    ROMANTIC;

    public static ComicGenre getGenre(String genre) {
        ComicGenre comicGenre;
        if (genre.equalsIgnoreCase("c")) {
            comicGenre = CHILDREN_STORY;
        } else if (genre.equalsIgnoreCase("d")) {
            comicGenre = DETECTIVE;
        } else if (genre.equalsIgnoreCase("f")) {
            comicGenre = FANTASY;
        } else if (genre.equalsIgnoreCase("a")) {
            comicGenre = ACTION;
        } else if (genre.equalsIgnoreCase("s")) {
            comicGenre = SCIENCE_FICTION;
        } else if (genre.equalsIgnoreCase("t")) {
            comicGenre = THRILLER;
        } else if (genre.equalsIgnoreCase("r")) {
            comicGenre = ROMANTIC;
        }else{
            System.out.println("Error. Select a genre from the following list:" +
                    "\nc - children" +
                    "\nd - detective" +
                    "\nf - fantasy" +
                    "\na - action" +
                    "\ns - science fiction" +
                    "\nt - thriller" +
                    "\nr - romantic");
            comicGenre = getGenre(MethodAddDelete.getString());
        }
        return comicGenre;
    }
}
