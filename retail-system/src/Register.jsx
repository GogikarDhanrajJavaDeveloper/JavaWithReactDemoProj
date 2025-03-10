//import employee from './classes/employee';
import { useState } from "react";

function Register() {

    const [emp, setemp] = useState({
        empId : 101,
        empName: 'dhanraj',
        empLoc: 'hyd',
        doj: '25-05-1997',
        desg: 'SE'
    });
    const [response, setresponse] = useState(null);

    const handleInputChange = (e) => {
        const {name, value} = e.target;
        setemp({...emp, [name]:value});
    };

    const handleSubmit = async(e) =>{
        e.preventDefault();

        try{
            const res = await fetch('http://localhost:9090/insert', {
                method: 'POST',
                headers: {
                    'Content-Type':'application/json',
                },
                body: JSON.stringify(emp),
            });

            const result = await res.json();
            setresponse(result);
        }catch(error){
            console.log('Error Occured during form data submission', error);
        }
    };

    return ( 

        <div>
            <h2>From the Register Page Component</h2>
            <form onSubmit={handleSubmit}>
            <label>ID</label> <br/>
            <input type="text" value={emp.empId} onChange={handleInputChange} /><br/>

            <label>Name</label> <br/>
            <input type="text" value={emp.empName} onChange={handleInputChange} /><br/>

            <label>Location</label><br/>
            <input type="text" value={emp.empLoc} onChange={handleInputChange} /><br/>

            <label>DOJ</label><br/>
            <input type="text" value={emp.doj} onChange={handleInputChange} /><br/>

            <label>Desigination</label><br/>
            <input type="text" value={emp.desg} onChange={handleInputChange} /><br/>
            &nbsp; &nbsp;
            <input type="submit"/>
           </form>
        </div>
    );
}
export default Register;