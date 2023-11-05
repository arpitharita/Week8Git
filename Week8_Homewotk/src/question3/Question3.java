package question3;

//Declare multidimensional array and store 5 countries and their capital and print them in
//console.

public class Question3 {

    public static void main(String[] args) {

        Question3 que = new Question3();
        que.CountryCapital();

    }
    public void CountryCapital(){
        String[][] CounrtyCapital= {{"London","Harrow"},{"Canada,Ontario"},{"Usa,Newyork"},{"India,Delhi"},{"Australia,Melbourne"}};

        for (int i =0; i < CounrtyCapital.length; i++){
            String Country= CounrtyCapital[0][1];
            String Capital = CounrtyCapital[i][1];
            System.out.println("Country : " +Country + " , Capital " +Capital);
        }
    }
}
