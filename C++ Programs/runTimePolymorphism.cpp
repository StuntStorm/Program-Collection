#include<iostream>
using namespace std;
class A{
protected:
        int var;
        int x;
        int y;
public:
        void setVal(int v){
          var=v;
        }
        void getVal(){
            cout<<"The Value of the Variable is : "<<var<<endl;
        }
};
class B: public A{
  public:
        void setVal(int a,int b){
          x=a;
          y=b;
        }
         void getVal(){
            cout<<"The Sum of the Variables is : "<<x+y<<endl;
        }

};
int main()
{
  A *base;
  B derrived;
  base = &derrived;
  base->setVal(4);
  base->getVal();

  B *b;
  B b1;
  b = &b1;
  b->setVal(435,345);
  b->getVal();
  return 0;
}