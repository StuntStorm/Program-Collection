#include <stdio.h>\
char upperName(char*, int);\
int main()\
\{\
char name[20];\
int i;\
printf("Enter your name: ");\
scanf("%s",name);\
for (i=0;name[i]!='\\0';i++)\
name[i]=upperName(name,i);\
printf("\\nYour name in upper case is: %s\\n",name);\
\}\
\
char upperName(char *name, int i)\
\{\
if (name[i]>='a' && name[i]<='z')\
name[i]-=32;\
return name[i];\
\}\
\
\
}
