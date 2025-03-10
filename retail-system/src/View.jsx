import React from "react";

function View(){

    const [data,setdata] =useState(null);
    const [loading, setloading] = 
    const handleGetRequest = async(e) => {
        e.preventDefault();

        try{
            const res = await fetch('http://localhost:9090/all', {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json', 
                },
                body: 
            })
        }
    }

    return (  
        <div>
            <h2>From the View Page Component</h2>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>LOC</th>
                    <th>DOJ</th>
                    <th>DESG</th>
                </tr>
                    <tbody>
                        <tr>
                            <td>

                            </td>
                        </tr>
                    </tbody>
            </table>
        </div>
    )
}

export default View;