package day_1;

public class UnionFind {
    private int id[];
    private int count;

    public UnionFind(int N) {
        count = N;
        id = new int[N];
        for(int i= 0; i<N; i++){
            id[i] = i;
        }
    }
    public int getCount(){
        return count;
    }
    public int find(int p){
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }
    public boolean connect(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        int p_father = find(p);
        int q_father = find(q);
        if (p_father < q_father){
            id[q_father] = p_father;
        }else if(p_father > q_father){
            id[p_father] = q_father;
        }
    }

    public static void main(String[] args) {

    }
}
