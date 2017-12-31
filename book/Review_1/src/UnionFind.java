public class UnionFind {

    private int[] id;
    private int[] sz;
    private int count;

    public UnionFind(int num){
        id = new int[num];
        sz = new int[num];
        count = num;
        for (int i = 0; i < num; i++) {
            id[i] = i;
        }
        for (int i = 0; i < num; i++) {
            sz[i] = 1;
        }
    }

    public void showId(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" ");
        }
        System.out.println();
    }

    public int find(int p){
        int root = 0;
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

    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) return;

        if (sz[rootP] < sz[rootQ]){
            id[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        }else {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        }
        count--;
    }

    public void showComponent(){
        System.out.println(count + " components");
    }

    public static void main(String[] args) {
        String dir = "/media/freshield/COASAIR1/LEARN_ALGORITHMS/book/Chp1/src/";
        String filename = "tinyUF.txt";
        String[] orders = ReadFile.returnValue(dir, filename);
        UnionFind wqu = new UnionFind(Integer.parseInt(orders[0]));
        wqu.showId();
        for (int i = 1; i < wqu.id.length; i++) {
            String order = orders[i];
            System.out.println(order);
            String[] temp = order.split(" ");
            int p = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);

            wqu.union(p, q);
        }
        wqu.showId();
        wqu.showComponent();
    }

}
