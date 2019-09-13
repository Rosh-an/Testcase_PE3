package com.stackroute;

public class StudentMarks {
  int n;
  int a[];
  public void numOfStudents(int n)
  {
    this.n=n;
    this.a=new int[n];
  }
  public String stuGrades(int g[])
  {
    int ctr=0;

      for (int i = 0; i < n; i++) {
        if (g[i] < 0 || g[i] > 100)
          ctr=1;
        else
          this.a[i] = g[i];
      }
      if(ctr==1)
        return "Error in values";
      else
        return "Success";
  }
}

