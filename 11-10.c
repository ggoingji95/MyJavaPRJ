#include <stdio.h>

void main()
{
	FILE *wfp;
	int i,j;

	wfp=fopen("c:\\c_study\\gugu.txt","w");

	for(i=0; i<10; i++){
		for(j=2;j<10;j++){
			if(i==0){
				fprintf(wfp, " #Á¦%d´Ü#\t",j);
				if(j==9){
					fprintf(wfp,"\n");
				}
			}
			else{
				fprintf(wfp, "%2dX%2d=%2d\t",j,i,j*i);
			}
		}
		fprintf(wfp, "\n");
	}
	fclose(wfp);
}
