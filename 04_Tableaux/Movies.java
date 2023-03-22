public class Movies {
    public static void main(String[] args) {
        String[] movies = { "movie 1", "movie 2", "movie 3" };
        String[] actors1 = { "actor1", "actor2", "actor3" };
        String[] actors2 = { "actor1", "actor2", "actor3" };
        String[] actors3 = { "actor1", "actor2", "actor3" };

        String[][] actors = { actors1, actors2, actors3 };

        for (int i = 0; i < 3; i++) {
            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : " + actors[i][0] + ", "
                    + actors[i][1] + " et " + actors[i][2]);
        }
    }
}
