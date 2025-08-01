import react, {useEffect, useState} from 'react'

const ActionDisplay = ()=>{
    const [actions,setActions] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/actions")
            .then(res=>res.json())
            .then(data=>setActions(data))
    },)

    return (
        <div>
            <div>Action</div>
            <div className="roadTable">
                {(actions.length>0)&&(
                    <div>
                        {actions.map((action,id)=>(
                            <div key={id}>
                                <p>{action.type}</p>
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