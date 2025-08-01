import react, {useEffect, useState} from 'react'

const ActionDisplay = ()=>{
    const [actions,setActions] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/actions")
            .then(res=>res.json())
            .then(data=>setActions(data))
    },[])

    console.log(actions)
    return (
        <div>
            <div>
                {(actions.length>0)&&(
                    <div>
                        {actions.map((action,id)=>(
                            <div key={id}>
                                <h1>{action.type}</h1>
                            </div>)
                        )}
                    </div>
                )
                }
            </div>
        </div>
    );
}

export default ActionDisplay;