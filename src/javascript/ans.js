function ans(idnumber, available, count, name, author){
    this.idnumber = Number(idnumber);
    this.available = Boolean (available);
    this.count = Number (count);
    this.name = String (name);
    this.author =  String (author);
}

let userInput = new ans('1','true','6','Mystery', 'miracle');
console.log(userInput);