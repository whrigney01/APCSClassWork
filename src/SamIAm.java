public class SamIAm {
    public static void main(String[] args) {

        // create 2D Array of Strings containing all of Green Eggs and Ham
        String[][] text = {
                {"That", "Sam-I-am!", "", "", "", "", "", ""},
                {"That", "Sam-I-am!", "", "", "", "", "", ""},
                {"I", "do", "not", "like", "that", "Sam-I-am!", "", ""},
                {"Do", "you", "like", "green", "eggs", "and", "ham?", ""},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"Would", "you", "like", "them", "here", "or", "there?", ""},
                {"I", "would", "not", "like", "them", "here", "or", "there."},
                {"I", "would", "not", "like", "them", "anywhere.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""},
                {"Would", "you", "like", "them", "in", "a", "house?", ""},
                {"Would", "you", "like", "them", "with", "a", "mouse?", ""},
                {"I", "do", "not", "like", "them", "in", "a", "house."},
                {"I", "do", "not", "like", "them", "with", "a", "mouse."},
                {"I", "do", "not", "like", "them", "here", "or", "there."},
                {"I", "do", "not", "like", "them", "anywhere.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""},
                {"Would", "you", "eat", "them", "in", "a", "box?", ""},
                {"Would", "you", "eat", "them", "with", "a", "fox?", ""},
                {"Not", "in", "a", "box.", "Not", "with", "a", "fox."},
                {"Not", "in", "a", "house.", "Not", "with", "a", "mouse."},
                {"I", "would", "not", "like", "them", "here", "or", "there."},
                {"I", "would", "not", "like", "them", "anywhere.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""},
                {"Would", "you?", "Could", "you?", "In", "a", "car?", ""},
                {"eat", "them!", "eat", "them!", "Here", "they", "are!", ""},
                {"I", "would", "not,", "could", "not,", "in", "a", "car."},
                {"You", "may", "like", "them.", "You", "will", "see.", ""},
                {"You", "may", "like", "them", "in", "a", "tree.", ""},
                {"I", "would", "not,", "could", "not", "in", "a", "tree."},
                {"Not", "in", "a", "car!", "You", "let", "me", "be!"},
                {"I", "do", "not", "like", "them", "in", "a", "box."},
                {"I", "do", "not", "like", "them", "with", "a", "fox."},
                {"I", "do", "not", "like", "them", "in", "a", "house."},
                {"I", "do", "not", "like", "them", "with", "a", "mouse."},
                {"I", "do", "not", "lik", "them", "here", "or", "there."},
                {"I", "do", "not", "like", "them", "anywhere.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""},
                {"A", "train!", "A", "train!", "A", "train!", "A", "train!"},
                {"Could", "you,", "would", "you,", "on", "a", "train?", ""},
                {"Not", "in", "a", "train!", "Not", "in", "a", "tree!"},
                {"Not", "in", "car,", "Sam!", "Let", "me", "be!", ""},
                {"I", "would", "not,", "could", "not,", "in", "a", "box."},
                {"I", "would", "not,", "could", "not,", "with", "a", "fox."},
                {"I", "will", "not", "eat", "them", "with", "a", "mouse."},
                {"I", "will", "not", "eat", "them", "in", "a", "house."},
                {"I", "will", "not", "eat", "them", "here", "or", "there."},
                {"I", "will", "not", "eat", "them", "anywhere.", "", ""},
                {"I", "do", "not", "like", "green", "eggs", "and", "ham."},
                {"I", "do", "not", "like", "them,", "Sam-I-am.", "", ""}
        };

        // count and print the number of times "eggs" appears
        int eggMoment = 0;
        for(int i = 0; i < text.length; i++){
            for (int j = 0; j < text[i].length; j++) {
                if(text[i][j].equalsIgnoreCase("eggs")){
                    eggMoment++;
                }
            }
        }
        System.out.println(eggMoment);
        // determine and print the average word length (ignore empty Strings)
        double eggMoment1 = 0;
        int tot = 0;
        for(int i = 0; i < text.length; i++){
            for (int j = 0; j < text[i].length; j++) {
                if(!text[i][j].equalsIgnoreCase("")){
                    eggMoment1 += text[i][j].length();
                    tot++;

                }
            }
        }
        System.out.println(eggMoment1/(double)tot);
    }
}
