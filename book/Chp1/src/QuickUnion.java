public class QuickUnion {


    private int[] id;
    private int count;

    public QuickUnion(int num){
        id = new int[num];
        count = num;
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

    public void showComponent(){
        System.out.println(count + " components");
    }

    public int find(int p){
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pROOT = find(p);
        int qROOT = find(q);

        if (pROOT == qROOT) return;

        id[pROOT] = qROOT;
        count --;
    }



    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        String filename = "tinyUF.txt";
        String[] orders = ReadFile.returnValue(dir, filename);
        QuickUnion qu = new QuickUnion(Integer.parseInt(orders[0]));
        qu.showId();
        for (int i = 1; i < qu.id.length; i++) {
            String order = orders[i];
            System.out.println(order);
            String[] temp = order.split(" ");
            int p = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);

            qu.union(p, q);
        }
        qu.showId();
        qu.showComponent();

    }


}
