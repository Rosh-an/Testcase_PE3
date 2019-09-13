package com.stackroute;

public class Matrix {
  int m1[][];
  int m2[][];
  int r,c;
  public void initmatrix(int r,int c,int a[],int b[])
  {
    int k=0;
    this.r=r;
    this.c=c;
    m1= new int[r][c];
    m2= new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        this.m1[i][j]=a[k];
//        System.out.println(a[k]);
        k++;
      }
    }
    k=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        this.m2[i][j]=b[k];
        k++;
      }
    }
  }

  public int[][] addmatrix()
  {
    int sum[][]=new int[this.r][this.c];
    for(int i=0;i<this.r;i++)
    {
      for(int j=0;j<this.c;j++)
      {
        sum[i][j]=m1[i][j]+m2[i][j];
        System.out.print(sum[i][j]+" ");
      }
      System.out.println();
    }
    return sum;
  }
}
