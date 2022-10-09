import React from 'react';
import './Navbar.css';
import {Link} from 'react-router-dom';

export default function Navbar(){
    return (
        <div>
            <div className='navbar'>
                <div ><h1 className='sss'>Arvi CZ Collections <img src = "logo192.png"  alt = "sai"></img></h1></div>
                <Link to = '/' className='navbarLink'>Home 🤷‍♂️</Link>
                <div className='align'>
                    <Link to='/con' className='navbarLink'>Wishlist</Link>
                    <Link to='/acc' className='navbarLink'>Account</Link>
                    <Link to='/log' className='navbarLink'>My Cart</Link>
                </div>
                <Link to='/best' className='navbarLink'>BestSelled </Link>
                <div class="subnav">
                    <button class="subnavbtn">Categories 🔻</button>
                    <div class="subnav-content">
                        <div className="rowc">
                        <div className="columnc">
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link></div>
                        <div className="columnc">
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link></div>
                        <div className="columnc">
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link>
                        <Link to='*' className='navbarLink'> Item is a most variety💥</Link></div>
                        </div>
                    </div>
                </div> 
                <form id = "example">
                    <input type="text" className = 'navy' name="search" placeholder="Search.." />
                </form>
            </div>
        </div>
    )
}