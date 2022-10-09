#include<stdio.h>
void main(){
    int a[50],b[50],c,d,i,j,f=0,g;
    printf("Enter size of array 1:\n");
    printf("Enter size of array 2:\n");
    scanf("%d%d",&c,&d);
    for(i=0;i<c;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<d;i++){
        scanf("%d",&b[i]);
    }
    g=c-1;
    for(i=0;i<d;i++){
        for(j=0;j<c;j++){
            if(a[j]==b[i])
            f++;
        }
        if(f==0){
            g++;
            a[g]=b[i];
        }
        f=0;
    }
    for(i=0;i<=g;i++){
        printf("%d",a[i]);
    }

}