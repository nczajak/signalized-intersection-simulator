import react from "react";

const CrossRoad=()=>{
    return (
        <>
            <div className="grid">
                <div className="grass"></div>
                <div className="vertical">
                    <div className="road_element"></div>
                    <div className="road_element" ></div>
                </div>
                <div className="grass"></div>
                <div className="horizontal">
                    <div className="road_element"></div>
                    <div className="road_element"></div>
                </div>
                <div className="horizontal">
                    <div className="vertical">
                        <div className="road_element"></div>
                        <div className="road_element"></div>
                    </div>
                    <div className="vertical">
                        <div className="road_element"></div>
                        <div className="road_element"></div>
                    </div>
                </div>
                <div className="horizontal">
                    <div className="road_element"></div>
                    <div className="road_element"></div>
                </div>
                <div className="grass"></div>
                <div className="vertical">
                    <div className="road_element"></div>
                    <div className="road_element"></div>
                </div>
                <div className="grass"></div>
            </div>

        </>
    )
}

export default CrossRoad;