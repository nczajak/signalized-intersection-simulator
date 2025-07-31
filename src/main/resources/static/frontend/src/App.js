import {useEffect, useState} from "react";
import * as http from "node:http";

function App() {

    const [actions,setActions] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/actios")
            .then(res=>res.text)
            .then(data=>setActions(data))
    },[])
    console.log(actions)
    return (
        <div>
            <h2>to jest strona głowna</h2>

        </div>
    );
}

export default App;
