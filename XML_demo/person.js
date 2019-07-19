var person = {
                name: "Brad",
                age: 22,
                address: {
                    street:"5 main st",
                    city:"Boston",
                },
                chidren:["Brianna","Nicholas"],
                email: function(){
                    return "bras@gmail.com";
                }
            }
            console.log(person.chidren[1]);
            document.write(person.chidren[1]);
            document.write("<br/>");
            document.write(person.email());
            alert("no error");