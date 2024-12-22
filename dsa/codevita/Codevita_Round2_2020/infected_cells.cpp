//Public cases: All passed
//Private cases: All cases not passed

#include <iostream>
using namespace std;
int main()
{
    int r,c;
    cin>>r>>c;
    int mat[r][c];

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++){
            cin>>mat[i][j];
        }
    }


    int flag = 0;
    int r_count = 0;
    int r_sq = 0;


    // for first row
    for(int j=0;j<c;j++){
        if(mat[0][j] == 6 && flag == 0)
        {
            r_count++;
            flag = 1;
        }
        else if(mat[0][j] != 6){
            flag = 0;
        }
    }
    flag = 0;

    // for remaining rows
    for(int i=1;i<r;i++){
        for(int j=0;j<c;j++){
            if(j == 0){
                if(mat[i][j] == 6 && mat[i-1][j] == 6 && mat[i-1][j+1] != 6)
                {
                    r_count++;
                    flag = 1;
                    continue;
                }
                else if(mat[i][j] == 6 && mat[i-1][j] == 6)
                {
                    r_sq = 1;
                    flag = 1;
                    continue;
                }
                else if(mat[i][j] == 6 && mat[i-1][j] !=6){
                    flag = 1;
                    r_count++;
                }
            }
            else if(j<c-1 && j>0){
                if(r_sq == 1){
                    if(mat[i][j] == 6 && mat[i-1][j] == 6){
                        continue;
                    }
                    else if(mat[i][j] == 6 ^ mat[i-1][j] == 6){
                        r_sq = 0;
                        r_count++;
                        if(mat[i][j] != 6)
                            flag = 0;

                    }
                }
                else{
                    if(mat[i][j] == 6 && mat[i-1][j] == 6 && mat[i-1][j-1] != 6 && mat[i-1][j+1] !=6 && flag == 0){
                        r_count++;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && mat[i-1][j] == 6 && mat[i-1][j-1] != 6 && flag == 0){
                        r_sq = 1;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && flag == 0)
                    {
                        r_count++;
                        flag = 1;
                    }
                    else if(mat[i][j] != 6){
                        flag = 0;
                    }
                }
            }
            else if(j == c-1){
                if(r_sq == 1){
                    if(mat[i][j] == 6 && mat[i-1][j] == 6){
                        continue;
                    }
                    else if(mat[i][j] == 6 ^ mat[i-1][j] == 6){
                        r_sq = 0;
                        r_count++;
                        if(mat[i][j] != 6)
                            flag = 0;

                    }
                }
                else{
                    if(mat[i][j] == 6 && mat[i-1][j] == 6 && mat[i-1][j-1] != 6 && flag == 0){
                        r_sq = 1;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && flag == 0)
                    {
                        r_count++;
                        flag = 1;
                    }
                    else if(mat[i][j] != 6){
                        flag = 0;
                    }
                }
            }

        }
        flag = 0;
        r_sq = 0;
    }

    flag = 0;  //reset flag
    int c_count = 0;
    int c_sq = 0;

    // for first column
    for(int i=0;i<r;i++){
        if(mat[i][0] == 6 && flag == 0)
        {
            c_count++;
            flag = 1;
        }
        else if(mat[i][0] != 6){
            flag = 0;
        }
    }
    flag = 0;

    // for remaining columns
    for(int j=1;j<c;j++){
        for(int i=0;i<r;i++){
            if(i == 0){
                if(mat[i][j] == 6 && mat[i][j-1] == 6 && mat[i+1][j-1] != 6)
                {
                    c_count++;
                    flag = 1;
                    continue;
                }
                else if(mat[i][j] == 6 && mat[i][j-1] == 6)
                {
                    c_sq = 1;
                    flag = 1;
                    continue;
                }
                else if(mat[i][j] == 6 && mat[i][j-1] !=6){
                    flag = 1;
                    c_count++;
                }
            }
            else if(i<r-1 && i>0){
                if(c_sq == 1){
                    if(mat[i][j] == 6 && mat[i][j-1] == 6){
                        continue;
                    }
                    else if(mat[i][j] == 6 ^ mat[i][j-1] == 6){
                        c_sq = 0;
                        c_count++;
                        if(mat[i][j] != 6)
                            flag = 0;

                    }
                }
                else{
                    if(mat[i][j] == 6 && mat[i][j-1] == 6 && mat[i-1][j-1] != 6 && mat[i+1][j-1] != 6 && flag == 0){
                        c_count++;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && mat[i][j-1] == 6 && mat[i-1][j-1] != 6 && flag == 0){
                        c_sq = 1;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && flag == 0)
                    {
                        c_count++;
                        flag = 1;
                    }
                    else if(mat[i][j] != 6){
                        flag = 0;
                    }
                }

            }
            else if(i == r-1){
               if(c_sq == 1){
                    if(mat[i][j] == 6 && mat[i][j-1] == 6){
                        continue;
                    }
                    else if(mat[i][j] == 6 ^ mat[i][j-1] == 6){
                        c_sq = 0;
                        c_count++;
                        if(mat[i][j] != 6)
                            flag = 0;

                    }
                }
                else{
                    if(mat[i][j] == 6 && mat[i][j-1] == 6 && mat[i-1][j-1] != 6 && flag == 0){
                        c_sq = 1;
                        flag = 1;
                        continue;
                    }
                    else if(mat[i][j] == 6 && flag == 0)
                    {
                        c_count++;
                        flag = 1;
                    }
                    else if(mat[i][j] != 6){
                        flag = 0;
                    }
                } 
            }
        }
        flag = 0;
        c_sq = 0;
    }

    // cout<<r_count;
    // cout<<c_count;

    if(r_count<c_count)
        cout<<r_count;

    else
        cout<<c_count;
}
