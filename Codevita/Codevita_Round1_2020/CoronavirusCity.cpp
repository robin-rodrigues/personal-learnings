// passed all public and private cases

#include <iostream>
using namespace std;
int main()
{
  	char x[9][20];
  	int total_safe = 0;
  	int total_infected = 0;
  	for(int i=8;i>=0;i--)
	{
  	  	for(int j=0;j<20;j++)
		{
  	    	cin>>x[i][j];
            if(x[i][j]=='a'||x[i][j]=='c')
                total_safe++;
    	}
  	}


    int i=0,j=0;

    int count_star = 0;

    int NE = 1, NW = 0, SE = 0, SW = 0;

    while(true){
        if(i==0&&j==0){
            cout<<j<<" "<<i<<"\n";
        }

        else if(x[i][j]=='.'){
            cout<<j<<" "<<i<<"\n";
        }

        else if(x[i][j]=='*'){
            count_star++;
            if(count_star == 2)
            {
                cout<<j<<" "<<i<<"\n";
                break;
            }


            cout<<j<<" "<<i<<"\n";
            if(j==0){
                if(NW){
                    NW = 0;
                    NE = 1;
                }
                else if(SW){
                    SW = 0;
                    SE = 1;
                }

            }
            else if(i==0){
                if(SE){
                    SE = 0;
                    NE = 1;
                }
                else if(SW){
                    SW = 0;
                    NW = 1;
                }
            }
            else if(j==19){
                if(SE){
                    SE = 0;
                    SW = 1;
                }
                else if(NE){
                    NE = 0;
                    NW = 1;
                }

            }
            else if(i==8){
                if(NE){
                    NE = 0;
                    SE = 1;
                }
                else if(NW){
                    NW = 0;
                    SW = 1;
                }
            }

        }

        else if(x[i][j]=='a'){
            total_infected++;
            total_safe--;
            x[i][j] = '-';
            cout<<j<<" "<<i<<"\n";
            if(NE){
              NE = 0;
              NW = 1;
            }
            else if(NW){
               NW = 0;
               SW = 1;
            }
            else if(SE){
              SE = 0;
              NE = 1;
            }
            else if(SW){
              SW = 0;
              SE = 1;
            }
        }

        else if(x[i][j]=='c'){
            total_infected++;
            total_safe--;
            x[i][j] = '-';
            cout<<j<<" "<<i<<"\n";
            if(NE){
              NE = 0;
              SE = 1;
            }
            else if(NW){
               NW = 0;
               NE = 1;
            }
            else if(SE){
              SE = 0;
              SW = 1;
            }
            else if(SW){
              SW = 0;
              NW = 1;
            }
        }

        if(NE==1){
            i++;
            j++;
        }
        if(NW==1){
            i++;
            j--;
        }
        if(SE==1){
            i--;
            j++;
        }
        if(SW==1){
            i--;
            j--;
        }

    }

    for(i=8;i>=0;i--){
        for(j=0;j<20;j++){
            cout<<x[i][j];
        }
        cout<<"\n";
    }
    cout<<"safe="<<total_safe<<"\n";
    cout<<"infected="<<total_infected;

}
