console.log("Hello World!");

const pets = ['cat', 'dog', 'rat'];
//forループを作って、配列内の各文字列が複数形になるように変更します。

for (var i = 0; i < 3; i++){
    pets[i] = pets[i] + 's';
}

console.log(pets);