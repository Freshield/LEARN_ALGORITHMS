public class QuickFind {

    private int[] id;

    public QuickFind(int num){
        id = new int[num];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public void showId(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

    public int find(int p){
        return id[p];
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pID = id[p];
        int qID = id[q];

        if (connected(p, q)) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID)   id[i] = qID;
        }
    }



    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        String filename = "tinyUF.txt";
        String[] orders = ReadFile.returnValue(dir, filename);
        QuickFind qf = new QuickFind(Integer.parseInt(orders[0]));
        qf.showId();
        for (int i = 1; i < qf.id.length; i++) {
            String order = orders[i];
            System.out.println(order);
            String[] temp = order.split(" ");
            int p = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);
            qf.union(p, q);
        }
        qf.showId();

    }

}
