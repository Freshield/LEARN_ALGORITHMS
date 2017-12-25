public class WeightedQuickUnion {

    private int[] id;
    private int[] sz;
    private int count;

    public WeightedQuickUnion(int num){
        id = new int[num];
        sz = new int[num];
        count = num;
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
        for (int i = 0; i < sz.length; i++) {
            sz[i] = 1;
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

    public int squeezeFind(int p){
        int root;
        int temp = p;
        while (temp != id[temp]){
            temp = id[temp];
        }
        root = temp;
        while (p != id[p]){
            p = id[p];
            id[p] = root;
        }
        return root;

    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int pROOT = find(p);
        int qROOT = find(q);

        if (pROOT == qROOT) return;

        if (sz[pROOT] < sz[qROOT]){
            id[pROOT] = qROOT;
            sz[qROOT] += sz[pROOT];
        }else {
            id[qROOT] = pROOT;
            sz[pROOT] += sz[qROOT];
        }
        count --;
    }

    public void squeezeUnion(int p, int q){
        int pROOT = squeezeFind(p);
        int qROOT = squeezeFind(q);

        if (pROOT == qROOT) return;

        if (sz[pROOT] < sz[qROOT]){
            id[pROOT] = qROOT;
            sz[qROOT] += sz[pROOT];
        }else {
            id[qROOT] = pROOT;
            sz[pROOT] += sz[qROOT];
        }
        count --;
    }




    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        String filename = "tinyUF.txt";
        String[] orders = ReadFile.returnValue(dir, filename);
        WeightedQuickUnion wqu = new WeightedQuickUnion(Integer.parseInt(orders[0]));
        wqu.showId();
        for (int i = 1; i < wqu.id.length; i++) {
            String order = orders[i];
            System.out.println(order);
            String[] temp = order.split(" ");
            int p = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);

            wqu.squeezeUnion(p, q);
        }
        wqu.showId();
        wqu.showComponent();

    }


}
