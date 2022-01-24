import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
public class cosine_Similarity {

    public static void main(String[] args) {
        System.out.println("Cosign Similarity =========================================");
        System.out.println();

        int TotalDocument = 3;

        String D1 = "shipment of gold damaged in a fire";
        String D2 = "delivery of silver arrived in a silver truck";
        String D3 = "shipment of gold arrived in a truck";
        String Q = "gold silver truck";
        //D2>D3>D1

//        String D1 = "new york times";
//        String D2 = "new york post";
//        String D3 = "los angles times";
//        String Q = "new new times";
//        D1>D2>D3

        cosine_Similarity obj = new cosine_Similarity();



//        convert str into hashmap.

        ArrayList<String> ListStr1 = obj.convertstrIntoArray(D1);
        HashMap<String,Integer> freOfstr1 = obj.countFre(ListStr1);
        System.out.println("D1 HAshmAp  = " + freOfstr1);



        ArrayList<String> ListStr2 = obj.convertstrIntoArray(D2);
        HashMap<String,Integer> freOfstr2 = obj.countFre(ListStr2);
        System.out.println("D2 HAshmAp = " +freOfstr2);


        ArrayList<String> ListStr3 = obj.convertstrIntoArray(D3);
        HashMap<String,Integer> freOfstr3 = obj.countFre(ListStr3);
        System.out.println("D3 HAshmAp = " +freOfstr3);


        ArrayList<String> ListQ = obj.convertstrIntoArray(Q);
        HashMap<String,Integer> freOfQ = obj.countFre(ListQ);
        System.out.println("Q HAshmAp = " +freOfQ );
        System.out.println();


        //This is all word of all document without no repeatation.
        ArrayList<String> totalString = obj.totalString(ListStr1,ListStr2,ListStr3);
        System.out.println("Total Words in one String = " +totalString );
        System.out.println();

        Map<String,Integer> totalStrMap = new LinkedHashMap<>();
        for (int i = 0; i < totalString.size(); i++) {
            int count = obj.countTotalStrFre(freOfstr1 , freOfstr2, freOfstr3 ,totalString.get(i));
            totalStrMap.put(totalString.get(i),count);
        }


        //IDF
        Map<String,Double> IDF = new LinkedHashMap<>();

        for (int i = 0; i < totalString.size(); i++) {
            double idf = obj.calIDF(totalStrMap,totalString.get(i) , TotalDocument);
            IDF.put(totalString.get(i),idf);
        }
        System.out.println("IDF CalCulation");
        System.out.println(IDF);
        System.out.println();


        // this is vecotr generation
        Map<String,Double> vectorD1 = new LinkedHashMap<>();
        for(int i =0;i<totalString.size();i++)
        {
            vectorD1.put(totalString.get(i) , obj.vectorRegration(freOfstr1,IDF,totalString.get(i)));
        }
        System.out.println("vector representation of D1 ===========");
        System.out.println(vectorD1);

//      2.  Vecot part of 2nd Document

        Map<String,Double> vectorD2 = new LinkedHashMap<>();
        for(int i =0;i<totalString.size();i++)
        {
            vectorD2.put(totalString.get(i) , obj.vectorRegration(freOfstr2,IDF,totalString.get(i)));
        }
        System.out.println("vector representation of D2 ===========");
        System.out.println(vectorD2);
        System.out.println();

//        3. Vector of Document 3rd

        Map<String,Double> vectorD3 = new LinkedHashMap<>();
        for(int i =0;i<totalString.size();i++)
        {
            vectorD3.put(totalString.get(i) , obj.vectorRegration(freOfstr3,IDF,totalString.get(i)));
        }
        System.out.println("vector representation of D3 ===========");
        System.out.println(vectorD3 );
//        System.out.println();

        Map<String,Double> vectorQ = new LinkedHashMap<>();

        for(int i =0;i<totalString.size();i++)
        {
            vectorQ.put(totalString.get(i) , obj.vectorRegration(freOfQ,IDF,totalString.get(i)));
        }
        System.out.println("vector representation of Q ===========");
        System.out.println(vectorQ);
        System.out.println();

//    calculate ranking od D1 and d
        double sumD1 =0;
        for (int i = 0;i<totalString.size();i++)
        {
            sumD1 +=obj.calculateRank(vectorD1,vectorQ,totalString.get(i));
        }
        System.out.println("Sum of D1 Vector =  " + sumD1);


        double sumD2 =0;
        for (int i = 0;i<totalString.size();i++)
        {
            sumD2 +=obj.calculateRank(vectorD2,vectorQ,totalString.get(i));
        }
        System.out.println("Sum of D2 Vector =  " +sumD2);


        double sumD3 =0;
        for (int i = 0;i<totalString.size();i++)
        {
            sumD3 +=obj.calculateRank(vectorD3,vectorQ,totalString.get(i));
        }
        System.out.println("Sum of D3 Vector =  " +sumD3);
        System.out.println();
//        75006677




//        Ranked MAp

        Map<String,Double> RankedMap = new LinkedHashMap<>();
        RankedMap.put("D1" , sumD1);
        RankedMap.put("D2" , sumD2);
        RankedMap.put("D3" , sumD3);
        ArrayList<Double> RankedList= new ArrayList<>();
        RankedList.add(sumD1);
        RankedList.add(sumD2);
        RankedList.add(sumD3);
        Collections.sort(RankedList,Collections.reverseOrder());

//        System.out.println(RankedMap+"mapraned");
//        System.out.println(RankedList + " list");

        System.out.println("Your Document with Cosign Similarity is ========");

        for (int i = 0; i < RankedList.size(); i++) {

            for (Map.Entry<String,Double> em : RankedMap.entrySet()) {

                    if (Objects.equals(em.getValue(), RankedList.get(i)))
                        System.out.print(em.getKey()+ ">");
                }
        }
        System.out.println();









    }

    private double calculateRank(Map<String, Double> vectorD1, Map<String, Double> vectorQ, String s) {
        double sum = 0.0;
        double resD1 = vectorD1.get(s);
        double resQ = vectorQ.get(s);
        sum = resD1*resQ;
        return sum;
    }

//    6.Method to calculate vector

    public double vectorRegration(HashMap<String,Integer> freOfstr7,Map<String,Double> IDF,String str)
    {
        double res = 0;

        if (freOfstr7.containsKey(str))
        {
            int D1 = 0;
            Double idf_val= 0.0;
            D1 = freOfstr7.get(str);
            idf_val = IDF.get(str);

//

            res = D1*idf_val;

        }
        else
            res = 0.0;


        return  res;

    }

//    5.Method to calculate the idf factor

    public double calIDF(Map<String,Integer> totalStrMap, String str , int totalDoc)
    {
        double idf = 0;
          final DecimalFormat df = new DecimalFormat("0.00");

        for(Map.Entry<String,Integer> en: totalStrMap.entrySet())
        {
            if (en.getKey()== str)
            {
//                System.out.println(en.getKey()+ " key");
//                int num = en.getValue();
//                System.out.println(num + " bnumm");
//                System.out.println(val+ " val");
                double val = (float)totalDoc/en.getValue();
                idf = Math.log10(val);
            }



        }
        BigDecimal bd = new BigDecimal(idf).setScale(3, RoundingMode.HALF_DOWN);
        double newInput = bd.doubleValue();
        return newInput;
    }
//    4. mwthod to find the word that is oresent in how many document.
    public int countTotalStrFre( HashMap<String,Integer> freOfstr1 ,HashMap<String,Integer> freOfstr2,HashMap<String,Integer> freOfstr3, String str)
    {
        int totalFre = 0;
        if (freOfstr1.containsKey(str))
            totalFre++;
        if (freOfstr2.containsKey(str))
            totalFre++;
        if (freOfstr3.containsKey(str))
            totalFre++;
        return totalFre;
    }

    //Method to create a total string in a list
    public ArrayList<String> totalString(ArrayList<String > str1, ArrayList<String > str2, ArrayList<String > str3)
    {
        Set<String> st = new HashSet<>();
        for (String i : str1) {
            st.add(i);
        }
        for (String i : str2) {
            st.add(i);
        }
        for (String i : str3) {
            st.add(i);
        }

        ArrayList<String> al = new ArrayList<>(st);


        Collections.sort(al);
        return al;
    }

    //method to convert string to Array
    public ArrayList<String> convertstrIntoArray(String str)
    {
        String strOfArray ="";
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == ' ' || i==str.length()-1)
            {
                if(i==str.length()-1)
                {
                    strOfArray+=str.charAt(str.length()-1);
                }
                al.add(strOfArray);
                strOfArray = "";
            }
            else
            {
                strOfArray+=str.charAt(i);
            }
        }

//        return countFre(al);
        return al;

    }
    //Methode to count frequency of Every document
    public LinkedHashMap<String, Integer> countFre(ArrayList<String> al )
    {

        LinkedHashMap<String,Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<al.size();i++)
        {
           mp.put(al.get(i),mp.getOrDefault(al.get(i) ,0)+1);
        }
        return mp;
    }

}
