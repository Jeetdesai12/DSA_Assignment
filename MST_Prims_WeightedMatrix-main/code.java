//Prim's Algorithm to find MST
//Jeetdesai12
//The given code is written in java

import java.util.Scanner;
public class Main
{
static int[][] wt;                //Stores weight matrix of graph
static int n;                     //Toatal nodes in graph
static int[][] edges;            //Stores edges of MST
static int cost;                 //Cost of MST
static void prims()
{

int[]u,lowcost,visited;
int min,mincost=0,i,j,v;
u=new int[n+1];
visited= new int[n+1];                  //keeps track of nodes added to MST
lowcost= new int[n+1];                  //Stores cost of lowest cost edge to node in MST
edges = new int[n][3];
visited[1]= 1;
for (i=2; i<= n; i++)
{

visited[i]=0;                          //Initialize all(except 1)as unvisited
u[i]=1;

/*
u[i] stores node (from MST constructed so far) cooressponding
to min cost edge to i where i is unvisited
*/

lowcost[i]= wt[1][i];

//Intiatially edge weight from 1st node
}

for(i=1;i<=n-1;i++)
{

min=lowcost[2];
v=2;
for(j=3; j<=n; j++){
if(lowcost[j]<min){
min=lowcost[j];
v=j;
}
}

edges[i][1]= u[v];
edges[i][2]=v;
mincost += lowcost[v];
visited[v]=1;

//mark v as visited
lowcost[v]=99;

/*
Updated lowcost of vertex v as High no. so that in future v
is not selected
*/

for(j=2; j<=n; j++)
{
/*
If edge weight from v to j < already explored,
then low cost edge of j and node j is not added to MST,
update lowcost and u
*/

if(wt[v][j] < lowcost[j] && visited[j]==0){
lowcost[j]=wt[v][j];
u[j]=v;
}
}
}
//PRINTING

System.out.println("\nEdges of min-cost spanning tree are");
for(i=1;i<=n-1;i++)
{
System.out.println("("+edges[i][1] + "," + edges[i][2] + ")");
}
System.out.println("Cost of Minimum Spanning Tree =" + mincost);
}

public static void main(String[] args)
{
int i, j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of vertices");n= sc.nextInt();

// 1 to nth location are being Used
// We are assuming that all values are less than 99

wt= new int[n+1][n+1];

System.out.println("Enter the weight matrix of graph:");
for(i=1; i<=n; i++)
{
for(j=1; j<= n; j++)
{
wt[i][j]= sc.nextInt();
}
}
prims();
}
}
