# cliques
assignment 0

if-then statement was added to allC_seed function in Graph class to prevent checking superfluous cliques. Only cliques that have potential to grow to at least input minimum are being checked. Runtime reduced.
difference in speed is mentioned in output log

assignment 1

Graph loading process was improved by using the serialization mechanism. Graph object is being serialized, so next time it will be needed, the loading time will be significantly lower.
difference in speed is mentioned in output log

assignment 2
Max clique. the program was added with G.getAllCliquesBySize(G.getMaxSize()) mathod, this method 
will produce an output file with all the max cliques present in current graph.


assignment 3

The server loads a graph. After performing set of operation, server turns it to a list of edges (two connected vertices) with all common neighbour vertices. After that, the server sends one edge from the list to each computer. A computer finds all the cliques , sends them back to server and gets another edge. The server organizes all cliques sent from all computers.

output example:

Wrong Parameters! should use: java -jar All_Cliques <input file> <round value> <min clique> <max clique> <output file> <max_cliques> <Graph convert flag>
Wrong Parameters! should use: java -jar All_Cliques test1.csv 0.7 5 7 test1_out.txt 10000 true
Reading a correlation matrix of size: 1728*1728 this may take a while
0%   20%   40%   60%   80%   100%
..................................
done reading the graph! Graph: |V|=1728 ,  |E|=4634

Small Graph loading:
Reading a corrolation matrix of size: 1728*1728 this may take a while
0%   20%   40%   60%   80%   100%
..................................
done reading the graph! Graph: |V|=1728 ,  |E|=10

Medium Graph loading:
Reading a corrolation matrix of size: 1728*1728 this may take a while
0%   20%   40%   60%   80%   100%
..................................
done reading the graph! Graph: |V|=1728 ,  |E|=1000

Big Graph loading:
Reading a corrolation matrix of size: 1728*1728 this may take a while
0%   20%   40%   60%   80%   100%
..................................
done reading the graph! Graph: |V|=1728 ,  |E|=100000

Init Graph: 809  ms
Init Graph From a File: 90  ms
|E|= 4634
Computing all cliques of size[20,27] based on 4634 edges graph, this may take a while
0%   20%   40%   60%   80%   100%
..................................
num of Cliques = 3266
Max Clique size = 23
Alg3: DFS Boaz: 26794  ms
|E|= 4634
Computing all cliques of size[20,27] based on 4634 edges graph, this may take a while
0%   20%   40%   60%   80%   100%
..................................
num of Cliques = 3266
Max Clique size = 23
Alg3: DFS Improved: 152  ms

Speed diffrence between Boaz and improved:  26642  ms
Boaz DFS and Improved DFS have produced the same results
