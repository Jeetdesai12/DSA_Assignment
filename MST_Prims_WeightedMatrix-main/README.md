# MST_Prims_WeightedMatrix
Weighted matrix as a input should be given to find MST using Prims Algorithm.

#The code is written by Jeetdesai12
#Prims algorithm is a greedy type algorithm to find minimum spanning tree for a graph.

The input should a weighted matrix.

Below is a example of how input is decide for a graph-->

Above is a graph with 4 vertices a,b,c,d
Distance (a,b)= 4
         (b,d)= 2
         (a,c)= 10
         (b,c)= 12
So to Find MST for this graph, input to be given to Code should be weighted matrix.
weighted matrix-->

     aa ab ac ad
     ba bb bc bd
     ca cb cc cd
     da db dc dd
     
So values according to questions are-->

     0 4 10 99
     4 0 12 2
     10 12 0 99
     99 2 99 0
         
Vertices will have self branch distance as 0
If two vertices don't have direct branch distance should be written as 99 0r INFINITE.

              
