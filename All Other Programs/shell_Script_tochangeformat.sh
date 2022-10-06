echo "Enter Directory:"
read Directory
cd $Directory
echo "Before"
ls
for a in *;
do mv "$a" "$a.new";
done
echo "After"
ls
