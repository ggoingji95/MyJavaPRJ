#include <stdio.h>

void main()
{
	int dan;
	for( dan = 2 ;  dan <= 9 ; dan ++){
		printf("#Á¦%d´Ü# ", dan);
	}
	printf("\n");
	printf("\n");
	int i, k;

	for(i = 1 ; i <= 9 ; i ++)
	{
		for( k = 2 ; k <= 9 ; k ++)
		{
			printf("%2dX%2d=%2d", k, i, k*i);
		}
		printf("\n");
	}
}
