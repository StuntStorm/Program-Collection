#include <stdio.h>
#include <stdlib.h>

void print_top_bottom_row(int x, int position_x)
{
	if (position_x == 1 || position_x == x)
	{
		putchar('o');
	}
	else
	{
		putchar('-');
	}
}

void print_middle_row(int x, int position_x)
{
	if (position_x == 1 || position_x == x)
	{
		putchar('|');
	}
	else
	{
		putchar(' ');
	}
}

/* Print the figure itself, using a different char depending
 * on the row position where it is placed. */
void print_figure(int x, int y, int position_x, int position_y)
{
	if (position_y == 1 || position_y == y)
	{
		print_top_bottom_row(x, position_x);
	}
	else
	{
		print_middle_row(x, position_x);
	}
}

/* Print a rectangle using the numbers from the parameters as
 * width (x) and height (y).
 *
 * At the end of the first loop we need to reset the position
 * x counter and create new line to place the next row*/
void create_square(int x, int y)
{
	int position_x;
	int position_y;

	position_x = 1;
	position_y = 1;
	if (x > 0 && y > 0)
	{
		while (position_y <= y)
		{
			while (position_x <= x)
			{
				print_figure(x, y, position_x, position_y);
				position_x++;
			}
			position_y++;
			position_x = 1;
			putchar('\n');
		}
	}
}

/*
 * Read the numbers from the user and call the function to
 * create the rectangle.
 */
int main(int argc, char **argv)
{
	if (argc == 3)
		create_square(strtol(argv[1], NULL, 10), strtol(argv[2], NULL, 10));
	else
		printf("Wrong args. \nUsage: ./a.out x y\n");
	return (0);
}
