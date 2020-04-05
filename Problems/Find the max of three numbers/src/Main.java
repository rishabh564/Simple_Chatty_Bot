public static int getNumberOfMaxParam(int a,int b,int c){
        // write a body here
        if(a>b&&b>c)
        return 1;
        if(a>c&&c>b)
        return 1;

        else if(b>a&&a>c)
        return 2;
        else if(b>c&&c>a)
        return 2;


        }