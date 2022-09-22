/* Finds how many pages in a book need to be turned to open the needed one.
{n} - the number of pages in the book
{p} - the needed one
P.S. First page considered as number zero. */

public static int pageCount(int n, int p) {
        int mid = n/2;
            if(p>mid) {
                if(p%2==1) return (n-p+1)/2;
                else return (n-p)/2;
            }
            else return p/2;
    }
