class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        //  let us do it later but for let me submit because of logic 
        HashMap<String, List<String>> store = new HashMap<>();

        for(String path:paths){
            String[] arr = path.split(" "); // Space ke beech mein se split kar diya 
            String directory = arr[0]; // oth content to directory hi hogi 

            for(int i=1; i<arr.length; i++){

                // File name and content ko alag alag kar diya
                String filename = arr[i].substring(0,arr[i].indexOf("("));
                String content = arr[i].substring(arr[i].indexOf("(")+1, arr[i].length()-1);
                List<String> filepaths = store.getOrDefault(content, new ArrayList<>());
                filepaths.add(directory+"/"+filename);
                store.put(content, filepaths);
            }
        }
        store.entrySet().removeIf(entry->entry.getValue().size()<2); // Duplicate ko hta diya 

        return new ArrayList<>(store.values()); // Advanced code hai bruhhh let us remember this 


    }
}