#include<stdio.h>
#include<string.h>
#include <stdlib.h>
int  main()
{
    char buffer[101];
	char* plain;
    char* cipher;
	int len,i,key;

	printf("Enter Plaintext:");
	gets(buffer);

	printf("Enter Key:");
	scanf("%d",&key);

	len=strlen(buffer);

    plain = (char *) malloc(len + 1);
    cipher = (char *) malloc(len + 1);
    strcpy(plain, buffer);
    
	for(i=0;i<len;i++)
	{
		cipher[i]=plain[i]+key;
		if((cipher[i]>'z') || (plain[i]<='Z' && cipher[i]>'Z'))
        {
		    cipher[i]=cipher[i]-26;
	    }
        // cipher[i] = ((plain[i]-97)+key)%26+97;
	}
    printf("Encrypted Text: \n");
	puts(cipher);

    printf("Decrypted Text: \n");
    for(i=0;i<strlen(cipher);i++)   
	{   
		plain[i]=cipher[i]-key;   
		if(plain[i]<'A'|| plain[i]<'a' && cipher[i]>='a')   
		plain[i]=plain[i]+26;   
	}   
	puts(plain);    
	return 0;
}
