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
            <div className="roadTable">
                <div className="tableHeader">Action</div>
                {(actions.length > 0) && (
                    <div>
                        {actions.map((action, id) => (
                            <div key={id} className="data_in_table">
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