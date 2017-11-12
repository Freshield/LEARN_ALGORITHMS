public class Whitelist {

    public static void main(String[] args) {
        int[] inputlist = In.readInts("tinyT.txt");
        int[] whitelist = In.readInts("tinyW.txt");
        StaticSEtofInts set = new StaticSEtofInts(whitelist);
        for (int i = 0; i < inputlist.length; i++) {
            int key = inputlist[i];
            if (!set.contains(key)){
                System.out.println(key);
            }
        }
    }

}
