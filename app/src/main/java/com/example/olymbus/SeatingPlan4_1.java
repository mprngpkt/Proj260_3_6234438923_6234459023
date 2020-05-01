package com.example.olymbus;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SeatingPlan4_1 extends Fragment {
    //int cntSelected=0;
    Button btnBack;
    Button btnBook;
    TableLayout timeTable;
    //seat
    ImageButton btnseat1A;
    ImageButton btnseat1B;
    ImageButton btnseat2A;
    ImageButton btnseat2B;
    ImageButton btnseat3A;
    ImageButton btnseat3B;
    ImageButton btnseat4A;
    ImageButton btnseat4B;
    ImageButton btnseat5A;
    ImageButton btnseat5B;


    //เชื่อมกับ .xml เมื่อใช้ extends fragment
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_seatingplan, container, false);


            TextView textView1 = (TextView) v.findViewById(R.id.textTitle);
            textView1.setText("Bus 1");
            TextView textdetail = (TextView) v.findViewById(R.id.text_detail);
            textdetail.setText("Destination : Tokyo Aquatics Centre \n Depart : 08.00 ");

        //TimeTable
        timeTable = v.findViewById(R.id.seatcolumn);

        //1A
       btnseat1A = v.findViewById (R.id.seat1A);
        btnseat1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat1A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();

            }
        });

        //1B
        btnseat1B = v.findViewById(R.id.seat1B);
        btnseat1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat1B.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //2A
        btnseat2A = v.findViewById(R.id.seat2A);
        btnseat2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat2A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //2B
        btnseat2B = v.findViewById(R.id.seat2B);
        btnseat2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat2B.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //3A
        btnseat3A = v.findViewById(R.id.seat3A);
        btnseat3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat3A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //3B
        btnseat3B = v.findViewById(R.id.seat3B);
        btnseat3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat3B.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //4A
        btnseat4A = v.findViewById(R.id.seat4A);
        btnseat4A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat4A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //4B
        btnseat4B = v.findViewById(R.id.seat4B);
        btnseat4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat4B.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //5A
        btnseat5A = v.findViewById(R.id.seat5A);
        btnseat5A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat5A.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });
        //5B
        btnseat5B = v.findViewById(R.id.seat5B);
        btnseat5B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnseat5B.setSelected(true);
                Toast.makeText(getContext(),"Selected",Toast.LENGTH_SHORT).show();
            }
        });

/*
        //book with alert dialog
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select");
                    alertDialog.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();

                }
            });
*/

//ลอง
        if (btnseat1A.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                alertDialog.setTitle("Select seat 1A");
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
               .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();

            }
        });
        } else if(btnseat1B.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat1B");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        }  else if(btnseat2A.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat2A");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        }  else if(btnseat2B.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat2B");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        }  else if(btnseat3A.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat3A");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();
                }
            });

        } else if(btnseat3B.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat 3B");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        } else if(btnseat4A.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat 4A");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        } else if(btnseat4B.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat 4B");
                    alertDialog.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();

                }
            });
        } else if (btnseat5A.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat5A");
                    alertDialog.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();

                }
            });
        } else if(btnseat5B.hasOnClickListeners()){
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Select seat5B");
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                                }
                            });
                    alertDialog.show();

                }
            });
        }else {
            btnBook = (Button) v.findViewById(R.id.btnBook);
            btnBook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Please select seat!!");
                    alertDialog.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getContext(), "Complete", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();

                }
            });
        }

        //back
        btnBack = (Button) v.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimeTableForDiving timeTableForDiving= new TimeTableForDiving();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, timeTableForDiving).commit();

            }
        });

        return v;
    }
}

