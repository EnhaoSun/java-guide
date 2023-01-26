path=$1
folder=${path%/*}
java=${path##*/}
class=${java%?????}

cd $folder
javac -encoding utf-8 $java
java $class