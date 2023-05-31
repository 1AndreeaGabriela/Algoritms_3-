

import java.util.Arrays;

class PGraph {

    public void Prim(int G[][], int V2) {

        int INF = 9999999;

        int no_edge; // nr de noduri


        boolean[] selected = new boolean[V2];
        Arrays.fill(selected, false);

        // initializam nr de noduri cu 0
        no_edge = 0;
        selected[0] = true;

        System.out.println("Nod : Cost");

        while (no_edge < V2 - 1) {


            int min = INF;
            int x = 0; // numar randuri
            int y = 0; // numar coloane

            for (int i = 0; i < V2; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V2; j++) {

                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            selected[y] = true;
            no_edge++;
        }
    }


}
